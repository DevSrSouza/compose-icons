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

public val SimpleIcons.MaterialUi: VectorAsset
    get() {
        if (_materialUi != null) {
            return _materialUi!!
        }
        _materialUi = VectorAssetBuilder(name = "MaterialUi", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.475f)
                verticalLineToRelative(10.39f)
                lineToRelative(3.0f, 1.733f)
                lineTo(3.0f, 7.67f)
                lineToRelative(6.0f, 3.465f)
                lineToRelative(6.0f, -3.465f)
                verticalLineToRelative(3.465f)
                lineToRelative(-6.0f, 3.463f)
                verticalLineToRelative(3.464f)
                lineToRelative(6.0f, 3.463f)
                lineToRelative(9.0f, -5.195f)
                lineTo(24.0f, 9.402f)
                lineToRelative(-3.0f, 1.733f)
                verticalLineToRelative(3.463f)
                lineToRelative(-6.0f, 3.464f)
                lineToRelative(-3.0f, -1.732f)
                lineToRelative(6.0f, -3.465f)
                lineTo(18.0f, 2.475f)
                lineTo(9.0f, 7.67f)
                lineTo(0.0f, 2.475f)
                close()
                moveTo(24.0f, 2.475f)
                lineToRelative(-3.0f, 1.73f)
                lineTo(21.0f, 7.67f)
                lineToRelative(3.0f, -1.732f)
                lineTo(24.0f, 2.474f)
                close()
            }
        }
        .build()
        return _materialUi!!
    }

private var _materialUi: VectorAsset? = null
