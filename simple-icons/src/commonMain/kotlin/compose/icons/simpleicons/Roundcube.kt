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

public val SimpleIcons.Roundcube: VectorAsset
    get() {
        if (_roundcube != null) {
            return _roundcube!!
        }
        _roundcube = VectorAssetBuilder(name = "Roundcube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9f, 8.6f)
                curveToRelative(0.0f, 1.2f, -0.3f, 2.3f, -0.7f, 3.3f)
                lineToRelative(0.7f, -0.4f)
                lineToRelative(3.4f, -2.0f)
                lineTo(20.6f, 8.0f)
                curveToRelative(-0.3f, -4.5f, -4.0f, -8.0f, -8.6f, -8.0f)
                reflectiveCurveTo(3.7f, 3.5f, 3.4f, 8.0f)
                lineTo(0.7f, 9.6f)
                lineToRelative(3.1f, 1.8f)
                lineToRelative(0.9f, 0.5f)
                curveToRelative(-0.5f, -1.0f, -0.7f, -2.1f, -0.7f, -3.3f)
                curveTo(4.0f, 4.2f, 7.6f, 0.7f, 11.9f, 0.7f)
                curveToRelative(4.5f, 0.0f, 8.0f, 3.5f, 8.0f, 7.9f)
                close()
                moveTo(0.1f, 17.3f)
                lineTo(11.7f, 24.0f)
                verticalLineToRelative(-7.4f)
                lineTo(0.1f, 9.9f)
                close()
                moveTo(12.3f, 16.6f)
                lineTo(12.3f, 24.0f)
                lineToRelative(11.6f, -6.7f)
                lineTo(23.9f, 9.9f)
                close()
            }
        }
        .build()
        return _roundcube!!
    }

private var _roundcube: VectorAsset? = null
