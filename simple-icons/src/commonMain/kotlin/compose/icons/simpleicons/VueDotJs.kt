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

public val SimpleIcons.VueDotJs: VectorAsset
    get() {
        if (_vueDotJs != null) {
            return _vueDotJs!!
        }
        _vueDotJs = VectorAssetBuilder(name = "VueDotJs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 1.61f)
                horizontalLineTo(14.06f)
                lineTo(12.0f, 5.16f)
                lineTo(9.94f, 1.61f)
                horizontalLineTo(0.0f)
                lineTo(12.0f, 22.39f)
                close()
                moveTo(12.0f, 14.08f)
                lineTo(5.16f, 2.23f)
                horizontalLineTo(9.59f)
                lineTo(12.0f, 6.41f)
                lineToRelative(2.41f, -4.18f)
                horizontalLineToRelative(4.43f)
                close()
            }
        }
        .build()
        return _vueDotJs!!
    }

private var _vueDotJs: VectorAsset? = null
