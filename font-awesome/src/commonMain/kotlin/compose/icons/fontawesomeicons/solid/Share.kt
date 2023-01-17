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

public val SolidGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(307.0f, 34.8f)
                curveToRelative(-11.5f, 5.1f, -19.0f, 16.6f, -19.0f, 29.2f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(176.0f)
                curveTo(78.8f, 128.0f, 0.0f, 206.8f, 0.0f, 304.0f)
                curveTo(0.0f, 417.3f, 81.5f, 467.9f, 100.2f, 478.1f)
                curveToRelative(2.5f, 1.4f, 5.3f, 1.9f, 8.1f, 1.9f)
                curveToRelative(10.9f, 0.0f, 19.7f, -8.9f, 19.7f, -19.7f)
                curveToRelative(0.0f, -7.5f, -4.3f, -14.4f, -9.8f, -19.5f)
                curveTo(108.8f, 431.9f, 96.0f, 414.4f, 96.0f, 384.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 12.6f, 7.4f, 24.1f, 19.0f, 29.2f)
                reflectiveCurveToRelative(25.0f, 3.0f, 34.4f, -5.4f)
                lineToRelative(160.0f, -144.0f)
                curveToRelative(6.7f, -6.1f, 10.6f, -14.7f, 10.6f, -23.8f)
                reflectiveCurveToRelative(-3.8f, -17.7f, -10.6f, -23.8f)
                lineToRelative(-160.0f, -144.0f)
                curveToRelative(-9.4f, -8.5f, -22.9f, -10.6f, -34.4f, -5.4f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
