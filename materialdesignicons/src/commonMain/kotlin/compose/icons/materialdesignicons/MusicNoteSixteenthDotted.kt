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

public val MaterialDesignIcons.MusicNoteSixteenthDotted: ImageVector
    get() {
        if (_musicNoteSixteenthDotted != null) {
            return _musicNoteSixteenthDotted!!
        }
        _musicNoteSixteenthDotted = Builder(name = "MusicNoteSixteenthDotted", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 16.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 18.5f)
                moveTo(18.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.55f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 14.0f, 17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _musicNoteSixteenthDotted!!
    }

private var _musicNoteSixteenthDotted: ImageVector? = null
