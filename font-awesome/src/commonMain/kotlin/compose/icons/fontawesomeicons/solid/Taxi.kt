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

public val SolidGroup.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(462.0f, 241.64f)
                lineToRelative(-22.0f, -84.84f)
                curveToRelative(-9.6f, -35.2f, -41.6f, -60.8f, -76.8f, -60.8f)
                lineTo(352.0f, 96.0f)
                lineTo(352.0f, 64.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(192.0f, 32.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-11.2f)
                curveToRelative(-35.2f, 0.0f, -67.2f, 25.6f, -76.8f, 60.8f)
                lineToRelative(-22.0f, 84.84f)
                curveTo(21.41f, 248.04f, 0.0f, 273.47f, 0.0f, 304.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 23.63f, 12.95f, 44.04f, 32.0f, 55.12f)
                lineTo(32.0f, 448.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(256.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-40.88f)
                curveToRelative(19.05f, -11.09f, 32.0f, -31.5f, 32.0f, -55.12f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -30.53f, -21.41f, -55.96f, -50.0f, -62.36f)
                close()
                moveTo(96.0f, 352.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(116.55f, 240.0f)
                lineToRelative(17.2f, -66.36f)
                curveToRelative(2.23f, -8.16f, 9.59f, -13.64f, 15.06f, -13.64f)
                horizontalLineToRelative(214.4f)
                curveToRelative(5.47f, 0.0f, 12.83f, 5.48f, 14.85f, 12.86f)
                lineTo(395.45f, 240.0f)
                horizontalLineToRelative(-278.9f)
                close()
                moveTo(416.0f, 352.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
