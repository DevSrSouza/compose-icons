package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 48.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(96.0f)
                lineTo(416.0f, 48.0f)
                close()
                moveTo(63.91f, 159.99f)
                curveTo(61.4f, 253.84f, 3.46f, 274.22f, 0.0f, 404.0f)
                verticalLineToRelative(44.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(160.0f, 288.0f)
                horizontalLineToRelative(32.0f)
                lineTo(192.0f, 128.0f)
                lineTo(95.84f, 128.0f)
                curveToRelative(-17.63f, 0.0f, -31.45f, 14.37f, -31.93f, 31.99f)
                close()
                moveTo(448.09f, 159.99f)
                curveToRelative(-0.48f, -17.62f, -14.3f, -31.99f, -31.93f, -31.99f)
                lineTo(320.0f, 128.0f)
                verticalLineToRelative(160.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-44.0f)
                curveToRelative(-3.46f, -129.78f, -61.4f, -150.16f, -63.91f, -244.01f)
                close()
                moveTo(176.0f, 32.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(96.0f)
                lineTo(192.0f, 48.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(224.0f, 288.0f)
                horizontalLineToRelative(64.0f)
                lineTo(288.0f, 128.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(160.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
