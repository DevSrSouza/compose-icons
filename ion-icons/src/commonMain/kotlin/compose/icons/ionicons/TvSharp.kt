package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TvSharp: ImageVector
    get() {
        if (_tvSharp != null) {
            return _tvSharp!!
        }
        _tvSharp = Builder(name = "TvSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.0f, 384.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(488.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(376.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 488.0f, 384.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 400.0f)
                lineTo(396.0f, 400.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 400.0f, 404.0f)
                lineTo(400.0f, 428.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 396.0f, 432.0f)
                lineTo(116.0f, 432.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 428.0f)
                lineTo(112.0f, 404.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 116.0f, 400.0f)
                close()
            }
        }
        .build()
        return _tvSharp!!
    }

private var _tvSharp: ImageVector? = null
