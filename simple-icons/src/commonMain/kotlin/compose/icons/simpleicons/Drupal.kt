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

public val SimpleIcons.Drupal: VectorAsset
    get() {
        if (_drupal != null) {
            return _drupal!!
        }
        _drupal = VectorAssetBuilder(name = "Drupal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.45f, 3.552f)
                curveTo(18.258f, 1.257f, 15.233f, 0.006f, 12.0f, 0.006f)
                curveTo(5.431f, 0.006f, 0.007f, 5.428f, 0.007f, 12.0f)
                reflectiveCurveTo(5.43f, 23.994f, 12.0f, 23.994f)
                reflectiveCurveTo(23.995f, 18.572f, 23.995f, 12.0f)
                curveToRelative(0.0f, -3.233f, -1.251f, -6.258f, -3.546f, -8.448f)
                close()
                moveTo(12.0f, 19.822f)
                curveToRelative(-3.65f, 0.0f, -6.57f, -2.92f, -6.57f, -6.57f)
                curveToRelative(0.0f, -3.025f, 2.085f, -5.111f, 3.858f, -6.884f)
                curveToRelative(1.252f, -1.252f, 2.4f, -2.4f, 2.712f, -3.755f)
                curveToRelative(0.313f, 1.252f, 1.46f, 2.399f, 2.712f, 3.65f)
                curveToRelative(1.773f, 1.774f, 3.859f, 3.86f, 3.859f, 6.884f)
                curveToRelative(0.0f, 3.65f, -2.92f, 6.571f, -6.571f, 6.675f)
                close()
            }
        }
        .build()
        return _drupal!!
    }

private var _drupal: VectorAsset? = null
