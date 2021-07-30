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

public val SolidGroup.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = Builder(name = "Weight", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 64.0f)
                horizontalLineToRelative(-25.98f)
                curveTo(438.44f, 92.28f, 448.0f, 125.01f, 448.0f, 160.0f)
                curveToRelative(0.0f, 105.87f, -86.13f, 192.0f, -192.0f, 192.0f)
                reflectiveCurveTo(64.0f, 265.87f, 64.0f, 160.0f)
                curveToRelative(0.0f, -34.99f, 9.56f, -67.72f, 25.98f, -96.0f)
                lineTo(64.0f, 64.0f)
                curveTo(28.71f, 64.0f, 0.0f, 92.71f, 0.0f, 128.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.29f, 28.71f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(35.29f, 0.0f, 64.0f, -28.71f, 64.0f, -64.0f)
                lineTo(512.0f, 128.0f)
                curveToRelative(0.0f, -35.29f, -28.71f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(256.0f, 320.0f)
                curveToRelative(88.37f, 0.0f, 160.0f, -71.63f, 160.0f, -160.0f)
                reflectiveCurveTo(344.37f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(96.0f, 71.63f, 96.0f, 160.0f)
                reflectiveCurveToRelative(71.63f, 160.0f, 160.0f, 160.0f)
                close()
                moveTo(255.7f, 168.06f)
                lineToRelative(33.58f, -78.36f)
                curveToRelative(3.5f, -8.17f, 12.94f, -11.92f, 21.03f, -8.41f)
                curveToRelative(8.12f, 3.48f, 11.88f, 12.89f, 8.41f, 21.0f)
                lineToRelative(-33.67f, 78.55f)
                curveTo(291.73f, 188.0f, 296.0f, 197.45f, 296.0f, 208.0f)
                curveToRelative(0.0f, 22.09f, -17.91f, 40.0f, -40.0f, 40.0f)
                reflectiveCurveToRelative(-40.0f, -17.91f, -40.0f, -40.0f)
                curveToRelative(0.0f, -21.98f, 17.76f, -39.77f, 39.7f, -39.94f)
                close()
            }
        }
        .build()
        return _weight!!
    }

private var _weight: ImageVector? = null
