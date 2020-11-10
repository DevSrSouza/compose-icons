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

public val SimpleIcons.SublimeText: VectorAsset
    get() {
        if (_sublimeText != null) {
            return _sublimeText!!
        }
        _sublimeText = VectorAssetBuilder(name = "SublimeText", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.24f, 12.06f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, -0.46f, -0.65f)
                lineTo(13.4f, 9.07f)
                lineToRelative(7.37f, -2.34f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, false, 0.47f, -0.66f)
                verticalLineTo(0.38f)
                arcTo(0.35f, 0.35f, 0.0f, false, false, 20.77f, 0.0f)
                lineTo(3.23f, 5.58f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, -0.47f, 0.64f)
                verticalLineToRelative(5.7f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.46f, 0.62f)
                lineToRelative(7.46f, 2.37f)
                lineTo(3.22f, 17.27f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, false, -0.46f, 0.66f)
                verticalLineToRelative(5.69f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.46f, 0.36f)
                lineToRelative(17.56f, -5.57f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.46f, -0.62f)
                close()
            }
        }
        .build()
        return _sublimeText!!
    }

private var _sublimeText: VectorAsset? = null
