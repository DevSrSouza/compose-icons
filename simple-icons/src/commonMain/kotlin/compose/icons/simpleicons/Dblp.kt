package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Dblp: VectorAsset
    get() {
        if (_dblp != null) {
            return _dblp!!
        }
        _dblp = VectorAssetBuilder(name = "Dblp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3f, 14.58f)
                lineToRelative(-2.45f, -9.16f)
                reflectiveCurveToRelative(-0.15f, -0.59f, -0.72f, -0.33f)
                lineToRelative(-5.6f, 2.6f)
                lineToRelative(0.86f, 3.2f)
                lineToRelative(1.09f, 4.08f)
                lineToRelative(0.01f, 0.06f)
                curveToRelative(0.05f, 0.47f, -0.41f, 0.79f, -0.41f, 0.79f)
                lineToRelative(-1.88f, 0.87f)
                lineToRelative(0.5f, 1.89f)
                lineToRelative(0.04f, 0.1f)
                curveToRelative(0.07f, 0.17f, 0.28f, 0.6f, 0.81f, 0.91f)
                lineToRelative(6.95f, 4.27f)
                reflectiveCurveToRelative(0.68f, 0.41f, 0.52f, -0.17f)
                lineToRelative(-1.98f, -7.4f)
                lineToRelative(1.86f, -0.86f)
                reflectiveCurveToRelative(0.56f, -0.26f, 0.4f, -0.85f)
                close()
                moveTo(13.76f, 14.67f)
                lineToRelative(-0.01f, -0.06f)
                lineToRelative(-1.13f, -4.22f)
                lineToRelative(-0.66f, -2.45f)
                lineToRelative(-0.67f, -2.49f)
                verticalLineToRelative(-0.04f)
                reflectiveCurveToRelative(-0.16f, -0.59f, -0.84f, -1.0f)
                lineTo(3.5f, 0.14f)
                reflectiveCurveToRelative(-0.68f, -0.41f, -0.52f, 0.17f)
                lineToRelative(1.99f, 7.42f)
                lineToRelative(-1.87f, 0.87f)
                reflectiveCurveToRelative(-0.56f, 0.26f, -0.4f, 0.85f)
                lineToRelative(2.45f, 9.16f)
                reflectiveCurveToRelative(0.16f, 0.59f, 0.72f, 0.33f)
                lineToRelative(6.17f, -2.87f)
                lineToRelative(1.3f, -0.61f)
                reflectiveCurveToRelative(0.52f, -0.24f, 0.42f, -0.79f)
                close()
            }
        }
        .build()
        return _dblp!!
    }

private var _dblp: VectorAsset? = null
