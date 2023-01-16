package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.LanguageHaskell: ImageVector
    get() {
        if (_languageHaskell != null) {
            return _languageHaskell!!
        }
        _languageHaskell = Builder(name = "LanguageHaskell", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.08f, 19.0f)
                lineTo(6.75f, 12.0f)
                lineTo(2.08f, 5.0f)
                horizontalLineTo(5.58f)
                lineTo(10.25f, 12.0f)
                lineTo(5.58f, 19.0f)
                horizontalLineTo(2.08f)
                moveTo(6.75f, 19.0f)
                lineTo(11.42f, 12.0f)
                lineTo(6.75f, 5.0f)
                horizontalLineTo(10.25f)
                lineTo(19.59f, 19.0f)
                horizontalLineTo(16.09f)
                lineTo(13.17f, 14.63f)
                lineTo(10.25f, 19.0f)
                horizontalLineTo(6.75f)
                moveTo(18.03f, 14.92f)
                lineTo(16.5f, 12.58f)
                horizontalLineTo(21.92f)
                verticalLineTo(14.92f)
                horizontalLineTo(18.03f)
                moveTo(15.7f, 11.42f)
                lineTo(14.14f, 9.08f)
                horizontalLineTo(21.92f)
                verticalLineTo(11.42f)
                horizontalLineTo(15.7f)
                close()
            }
        }
        .build()
        return _languageHaskell!!
    }

private var _languageHaskell: ImageVector? = null
