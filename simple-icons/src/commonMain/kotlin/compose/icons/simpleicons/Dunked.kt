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

public val SimpleIcons.Dunked: VectorAsset
    get() {
        if (_dunked != null) {
            return _dunked!!
        }
        _dunked = VectorAssetBuilder(name = "Dunked", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.791f, 0.0f)
                verticalLineTo(19.766f)
                arcToRelative(4.18f, 4.18f, 0.0f, false, false, 4.182f, 4.12f)
                horizontalLineToRelative(4.18f)
                verticalLineTo(4.122f)
                arcTo(4.18f, 4.18f, 0.0f, false, false, 17.972f, 0.0f)
                horizontalLineTo(13.79f)
                close()
                moveTo(6.326f, 14.93f)
                arcToRelative(4.479f, 4.479f, 0.0f, false, false, -4.478f, 4.37f)
                verticalLineToRelative(0.221f)
                arcToRelative(4.479f, 4.479f, 0.0f, false, false, 8.957f, 0.0f)
                verticalLineToRelative(-0.214f)
                arcToRelative(4.479f, 4.479f, 0.0f, false, false, -4.479f, -4.377f)
                close()
            }
        }
        .build()
        return _dunked!!
    }

private var _dunked: VectorAsset? = null
