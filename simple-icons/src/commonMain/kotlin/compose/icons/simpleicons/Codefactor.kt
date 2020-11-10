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

public val SimpleIcons.Codefactor: VectorAsset
    get() {
        if (_codefactor != null) {
            return _codefactor!!
        }
        _codefactor = VectorAssetBuilder(name = "Codefactor", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.37f, 2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 2.75f, 5.3f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 0.12f, 2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 2.75f, 0.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.62f, 2.65f)
                close()
                moveTo(5.37f, 12.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -2.62f, 2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 0.12f, 12.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.63f, -2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 5.37f, 12.0f)
                close()
                moveTo(5.37f, 21.35f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 2.75f, 24.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -2.63f, -2.65f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.63f, -2.65f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.62f, 2.65f)
                close()
                moveTo(11.31f, 0.0f)
                arcTo(2.64f, 2.64f, 0.0f, false, false, 8.7f, 2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, false, 11.3f, 5.3f)
                horizontalLineToRelative(9.94f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, false, 2.63f, -2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, false, 21.25f, 0.0f)
                horizontalLineToRelative(-9.94f)
                close()
                moveTo(8.7f, 12.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.62f, -2.65f)
                lineTo(17.0f, 9.35f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 19.6f, 12.0f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 17.0f, 14.65f)
                lineTo(11.3f, 14.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 8.7f, 12.0f)
                close()
            }
        }
        .build()
        return _codefactor!!
    }

private var _codefactor: VectorAsset? = null
