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

public val SimpleIcons.LinuxFoundation: VectorAsset
    get() {
        if (_linuxFoundation != null) {
            return _linuxFoundation!!
        }
        _linuxFoundation = VectorAssetBuilder(name = "LinuxFoundation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8f, 9.6f)
                verticalLineToRelative(9.6f)
                horizontalLineToRelative(9.6f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(9.6f)
                horizontalLineToRelative(4.8f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-7.2f)
                verticalLineToRelative(-4.8f)
                horizontalLineToRelative(2.4f)
                verticalLineTo(4.8f)
                horizontalLineTo(4.8f)
                verticalLineToRelative(2.4f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _linuxFoundation!!
    }

private var _linuxFoundation: VectorAsset? = null
