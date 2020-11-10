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

public val SimpleIcons.Monzo: VectorAsset
    get() {
        if (_monzo != null) {
            return _monzo!!
        }
        _monzo = VectorAssetBuilder(name = "Monzo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 17.26f)
                horizontalLineTo(12.0f)
                lineToRelative(5.93f, -5.92f)
                verticalLineToRelative(11.04f)
                arcToRelative(0.45f, 0.45f, -180.0f, false, false, 0.76f, 0.31f)
                lineToRelative(4.98f, -4.97f)
                arcToRelative(1.11f, 1.11f, -180.0f, false, false, 0.32f, -0.8f)
                verticalLineTo(5.29f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-3.98f, -3.97f)
                arcToRelative(0.44f, 0.44f, -180.0f, false, false, -0.63f, 0.0f)
                lineTo(12.0f, 8.69f)
                lineToRelative(-7.41f, -7.4f)
                arcToRelative(0.44f, 0.44f, -180.0f, false, false, -0.63f, 0.0f)
                lineTo(0.0f, 5.28f)
                horizontalLineToRelative(0.01f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(11.66f)
                arcToRelative(1.11f, 1.11f, -180.0f, false, false, 0.32f, 0.79f)
                lineToRelative(4.97f, 4.98f)
                arcToRelative(0.45f, 0.45f, -180.0f, false, false, 0.76f, -0.32f)
                lineToRelative(0.01f, -11.06f)
                lineToRelative(5.93f, 5.94f)
                close()
            }
        }
        .build()
        return _monzo!!
    }

private var _monzo: VectorAsset? = null
