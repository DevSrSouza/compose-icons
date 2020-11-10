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

public val SimpleIcons.Gitpod: VectorAsset
    get() {
        if (_gitpod != null) {
            return _gitpod!!
        }
        _gitpod = VectorAssetBuilder(name = "Gitpod", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6f, 17.0f)
                verticalLineTo(7.6f)
                lineTo(1.5f, 6.4f)
                verticalLineToRelative(11.8f)
                lineTo(11.7f, 24.0f)
                verticalLineToRelative(-2.4f)
                close()
                moveTo(11.7f, 19.2f)
                verticalLineToRelative(-6.9f)
                lineToRelative(-6.0f, -3.5f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(12.0f, 2.4f)
                lineToRelative(8.1f, 4.7f)
                lineToRelative(2.1f, -1.2f)
                lineTo(12.0f, 0.0f)
                lineTo(1.8f, 5.9f)
                lineToRelative(2.1f, 1.2f)
                close()
                moveTo(18.0f, 8.3f)
                lineToRelative(-6.0f, -3.5f)
                lineToRelative(-6.0f, 3.5f)
                lineToRelative(6.0f, 3.5f)
                close()
                moveTo(12.3f, 19.3f)
                lineToRelative(6.0f, -3.5f)
                verticalLineToRelative(-2.4f)
                lineToRelative(-4.1f, 2.4f)
                verticalLineToRelative(-2.4f)
                lineToRelative(6.2f, -3.6f)
                verticalLineTo(17.0f)
                lineToRelative(-8.1f, 4.6f)
                verticalLineTo(24.0f)
                lineToRelative(10.2f, -5.8f)
                verticalLineTo(6.4f)
                lineToRelative(-10.2f, 5.9f)
                close()
                moveTo(12.0f, 12.1f)
                close()
            }
        }
        .build()
        return _gitpod!!
    }

private var _gitpod: VectorAsset? = null
