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

public val BrandsGroup.SquareInstagram: ImageVector
    get() {
        if (_squareInstagram != null) {
            return _squareInstagram!!
        }
        _squareInstagram = Builder(name = "SquareInstagram", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 202.66f)
                arcTo(53.34f, 53.34f, 0.0f, true, false, 277.36f, 256.0f)
                arcTo(53.38f, 53.38f, 0.0f, false, false, 224.0f, 202.66f)
                close()
                moveTo(348.71f, 161.66f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -30.41f, -30.41f)
                curveToRelative(-21.0f, -8.29f, -71.0f, -6.43f, -94.3f, -6.43f)
                reflectiveCurveToRelative(-73.25f, -1.93f, -94.31f, 6.43f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -30.41f, 30.41f)
                curveToRelative(-8.28f, 21.0f, -6.43f, 71.05f, -6.43f, 94.33f)
                reflectiveCurveTo(91.0f, 329.26f, 99.32f, 350.33f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 30.41f, 30.41f)
                curveToRelative(21.0f, 8.29f, 71.0f, 6.43f, 94.31f, 6.43f)
                reflectiveCurveToRelative(73.24f, 1.93f, 94.3f, -6.43f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 30.41f, -30.41f)
                curveToRelative(8.35f, -21.0f, 6.43f, -71.05f, 6.43f, -94.33f)
                reflectiveCurveTo(357.1f, 182.74f, 348.75f, 161.67f)
                close()
                moveTo(224.0f, 338.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, true, true, 82.0f, -82.0f)
                arcTo(81.9f, 81.9f, 0.0f, false, true, 224.0f, 338.0f)
                close()
                moveTo(309.38f, 189.7f)
                arcToRelative(19.14f, 19.14f, 0.0f, true, true, 19.13f, -19.14f)
                arcTo(19.1f, 19.1f, 0.0f, false, true, 309.42f, 189.74f)
                close()
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 0.0f, 80.0f)
                lineTo(0.0f, 432.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                lineTo(400.0f, 480.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 400.0f, 32.0f)
                close()
                moveTo(382.88f, 322.0f)
                curveToRelative(-1.29f, 25.63f, -7.14f, 48.34f, -25.85f, 67.0f)
                reflectiveCurveToRelative(-41.4f, 24.63f, -67.0f, 25.85f)
                curveToRelative(-26.41f, 1.49f, -105.59f, 1.49f, -132.0f, 0.0f)
                curveToRelative(-25.63f, -1.29f, -48.26f, -7.15f, -67.0f, -25.85f)
                reflectiveCurveToRelative(-24.63f, -41.42f, -25.85f, -67.0f)
                curveToRelative(-1.49f, -26.42f, -1.49f, -105.61f, 0.0f, -132.0f)
                curveToRelative(1.29f, -25.63f, 7.07f, -48.34f, 25.85f, -67.0f)
                reflectiveCurveToRelative(41.47f, -24.56f, 67.0f, -25.78f)
                curveToRelative(26.41f, -1.49f, 105.59f, -1.49f, 132.0f, 0.0f)
                curveToRelative(25.63f, 1.29f, 48.33f, 7.15f, 67.0f, 25.85f)
                reflectiveCurveToRelative(24.63f, 41.42f, 25.85f, 67.05f)
                curveTo(384.37f, 216.44f, 384.37f, 295.56f, 382.88f, 322.0f)
                close()
            }
        }
        .build()
        return _squareInstagram!!
    }

private var _squareInstagram: ImageVector? = null
