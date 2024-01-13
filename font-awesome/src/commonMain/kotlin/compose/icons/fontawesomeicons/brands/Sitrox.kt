package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Sitrox: ImageVector
    get() {
        if (_sitrox != null) {
            return _sitrox!!
        }
        _sitrox = Builder(name = "Sitrox", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.439f, 0.008f)
                verticalLineTo(0.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(64.0f)
                curveTo(64.0f, 57.601f, 141.755f, 0.475f, 212.439f, 0.008f)
                close()
                moveTo(237.256f, 192.0f)
                verticalLineTo(192.007f)
                curveTo(307.135f, 192.475f, 384.0f, 249.6f, 384.0f, 320.0f)
                horizontalLineTo(210.809f)
                verticalLineTo(319.995f)
                curveTo(140.915f, 319.563f, 64.0f, 262.424f, 64.0f, 192.0f)
                horizontalLineTo(237.256f)
                close()
                moveTo(235.565f, 511.993f)
                curveTo(306.251f, 511.521f, 384.0f, 454.399f, 384.0f, 384.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(512.0f)
                horizontalLineTo(235.565f)
                verticalLineTo(511.993f)
                close()
            }
        }
        .build()
        return _sitrox!!
    }

private var _sitrox: ImageVector? = null
