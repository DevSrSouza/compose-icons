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

public val SimpleIcons.HellyHansen: VectorAsset
    get() {
        if (_hellyHansen != null) {
            return _hellyHansen!!
        }
        _hellyHansen = VectorAssetBuilder(name = "HellyHansen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.27f, 10.09f)
                horizontalLineToRelative(4.08f)
                lineTo(8.35f, 5.63f)
                horizontalLineToRelative(4.11f)
                lineTo(9.98f, 18.37f)
                lineTo(8.34f, 18.37f)
                lineTo(8.34f, 14.0f)
                lineTo(4.26f, 14.0f)
                verticalLineToRelative(4.37f)
                lineTo(0.0f, 18.37f)
                lineTo(0.0f, 5.63f)
                horizontalLineToRelative(4.27f)
                close()
                moveTo(19.72f, 13.91f)
                horizontalLineToRelative(-4.07f)
                verticalLineToRelative(4.46f)
                horizontalLineToRelative(-4.1f)
                lineToRelative(2.47f, -12.74f)
                horizontalLineToRelative(1.64f)
                lineTo(15.66f, 10.0f)
                horizontalLineToRelative(4.08f)
                lineTo(19.74f, 5.63f)
                lineTo(24.0f, 5.63f)
                verticalLineToRelative(12.74f)
                horizontalLineToRelative(-4.28f)
                close()
            }
        }
        .build()
        return _hellyHansen!!
    }

private var _hellyHansen: VectorAsset? = null
