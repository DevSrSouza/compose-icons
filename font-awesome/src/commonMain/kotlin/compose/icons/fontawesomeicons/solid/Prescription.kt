package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Prescription: ImageVector
    get() {
        if (_prescription != null) {
            return _prescription!!
        }
        _prescription = Builder(name = "Prescription", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.26f, 352.0f)
                lineToRelative(78.06f, -78.06f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0.0f, -22.63f)
                lineToRelative(-22.63f, -22.63f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineTo(256.0f, 306.74f)
                lineToRelative(-83.96f, -83.96f)
                curveTo(219.31f, 216.8f, 256.0f, 176.89f, 256.0f, 128.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                horizontalLineTo(16.0f)
                curveTo(7.16f, 32.0f, 0.0f, 39.16f, 0.0f, 48.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-80.0f)
                horizontalLineToRelative(18.75f)
                lineToRelative(128.0f, 128.0f)
                lineToRelative(-78.06f, 78.06f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(22.63f, 22.63f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineTo(256.0f, 397.25f)
                lineToRelative(78.06f, 78.06f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineToRelative(22.63f, -22.63f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0.0f, -22.63f)
                lineTo(301.26f, 352.0f)
                close()
                moveTo(64.0f, 96.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.64f, 0.0f, 32.0f, 14.36f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.36f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(96.0f)
                close()
            }
        }
        .build()
        return _prescription!!
    }

private var _prescription: ImageVector? = null
