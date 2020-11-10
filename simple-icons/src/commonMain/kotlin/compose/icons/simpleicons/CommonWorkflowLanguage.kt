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

public val SimpleIcons.CommonWorkflowLanguage: VectorAsset
    get() {
        if (_commonWorkflowLanguage != null) {
            return _commonWorkflowLanguage!!
        }
        _commonWorkflowLanguage = VectorAssetBuilder(name = "CommonWorkflowLanguage", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.063f, 9.205f)
                lineToRelative(-3.565f, 3.568f)
                lineToRelative(3.518f, 3.512f)
                lineToRelative(1.545f, -1.545f)
                lineToRelative(-1.975f, -1.967f)
                lineToRelative(2.023f, -2.023f)
                lineToRelative(-1.546f, -1.545f)
                close()
                moveTo(13.606f, 22.423f)
                lineTo(11.6f, 20.375f)
                lineToRelative(3.786f, -3.815f)
                lineToRelative(-1.559f, -1.573f)
                lineToRelative(-5.33f, 5.403f)
                lineToRelative(0.115f, 0.114f)
                lineToRelative(-0.015f, 0.008f)
                lineToRelative(3.456f, 3.484f)
                close()
                moveTo(15.502f, 8.858f)
                lineToRelative(-3.685f, -3.541f)
                lineToRelative(3.685f, -3.722f)
                lineTo(13.936f, 0.0f)
                lineTo(8.598f, 5.352f)
                lineToRelative(0.108f, 0.101f)
                verticalLineToRelative(0.007f)
                lineToRelative(5.252f, 4.943f)
                close()
            }
        }
        .build()
        return _commonWorkflowLanguage!!
    }

private var _commonWorkflowLanguage: VectorAsset? = null
