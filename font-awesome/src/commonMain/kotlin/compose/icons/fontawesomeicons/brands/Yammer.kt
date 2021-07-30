package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Yammer: ImageVector
    get() {
        if (_yammer != null) {
            return _yammer!!
        }
        _yammer = Builder(name = "Yammer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(421.78f, 152.17f)
                arcTo(23.06f, 23.06f, 0.0f, false, false, 400.9f, 112.0f)
                curveToRelative(-0.83f, 0.43f, -1.71f, 0.9f, -2.63f, 1.4f)
                curveToRelative(-15.25f, 8.4f, -118.33f, 80.62f, -106.69f, 88.77f)
                reflectiveCurveToRelative(82.04f, -23.61f, 130.2f, -50.0f)
                close()
                moveTo(421.78f, 369.34f)
                curveToRelative(-48.16f, -26.38f, -118.64f, -58.1f, -130.2f, -50.0f)
                reflectiveCurveToRelative(91.42f, 80.35f, 106.69f, 88.74f)
                curveToRelative(0.92f, 0.51f, 1.8f, 1.0f, 2.63f, 1.41f)
                arcToRelative(23.07f, 23.07f, 0.0f, false, false, 20.88f, -40.15f)
                close()
                moveTo(464.21f, 237.0f)
                curveToRelative(-0.95f, 0.0f, -1.95f, -0.06f, -3.0f, -0.06f)
                curveToRelative(-17.4f, 0.0f, -142.52f, 13.76f, -136.24f, 26.51f)
                reflectiveCurveToRelative(83.3f, 18.74f, 138.21f, 18.76f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, 1.0f, -45.21f)
                close()
                moveTo(31.0f, 96.65f)
                arcToRelative(24.88f, 24.88f, 0.0f, false, true, 46.14f, -18.4f)
                lineToRelative(81.0f, 205.06f)
                horizontalLineToRelative(1.21f)
                lineToRelative(77.0f, -203.53f)
                arcToRelative(23.52f, 23.52f, 0.0f, false, true, 44.45f, 15.27f)
                lineTo(171.2f, 368.44f)
                curveTo(152.65f, 415.66f, 134.08f, 448.0f, 77.91f, 448.0f)
                arcToRelative(139.67f, 139.67f, 0.0f, false, true, -23.81f, -1.95f)
                arcToRelative(21.31f, 21.31f, 0.0f, false, true, 6.9f, -41.77f)
                curveToRelative(0.66f, 0.06f, 10.91f, 0.66f, 13.86f, 0.66f)
                curveToRelative(30.47f, 0.0f, 43.74f, -18.94f, 58.07f, -59.41f)
                close()
            }
        }
        .build()
        return _yammer!!
    }

private var _yammer: ImageVector? = null
