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

public val SolidGroup.OilCan: ImageVector
    get() {
        if (_oilCan != null) {
            return _oilCan!!
        }
        _oilCan = Builder(name = "OilCan", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(629.8f, 160.31f)
                lineTo(416.0f, 224.0f)
                lineToRelative(-50.49f, -25.24f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -28.62f, -6.76f)
                lineTo(280.0f, 192.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(176.0f, 96.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(-56.0f)
                lineTo(37.72f, 166.86f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -5.79f, -0.53f)
                curveTo(14.67f, 166.33f, 0.0f, 180.36f, 0.0f, 198.34f)
                verticalLineToRelative(94.95f)
                curveToRelative(0.0f, 15.46f, 11.06f, 28.72f, 26.28f, 31.48f)
                lineTo(96.0f, 337.46f)
                lineTo(96.0f, 384.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(274.63f)
                curveToRelative(8.55f, 0.0f, 16.75f, -3.42f, 22.76f, -9.51f)
                lineToRelative(212.26f, -214.75f)
                curveToRelative(1.5f, -1.5f, 2.34f, -3.54f, 2.34f, -5.66f)
                lineTo(639.99f, 168.0f)
                curveToRelative(0.01f, -5.31f, -5.08f, -9.15f, -10.19f, -7.69f)
                close()
                moveTo(96.0f, 288.67f)
                lineToRelative(-48.0f, -8.73f)
                verticalLineToRelative(-62.43f)
                lineToRelative(48.0f, 8.73f)
                verticalLineToRelative(62.43f)
                close()
                moveTo(549.33f, 373.33f)
                curveToRelative(0.0f, 23.56f, 19.1f, 42.67f, 42.67f, 42.67f)
                reflectiveCurveToRelative(42.67f, -19.1f, 42.67f, -42.67f)
                reflectiveCurveTo(592.0f, 288.0f, 592.0f, 288.0f)
                reflectiveCurveToRelative(-42.67f, 61.77f, -42.67f, 85.33f)
                close()
            }
        }
        .build()
        return _oilCan!!
    }

private var _oilCan: ImageVector? = null
