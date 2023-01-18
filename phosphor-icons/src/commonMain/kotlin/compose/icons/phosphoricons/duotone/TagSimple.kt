package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) {
            return _tagSimple!!
        }
        _tagSimple = Builder(name = "TagSimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(194.4f, 196.4f)
                lineTo(240.0f, 128.0f)
                lineTo(194.4f, 59.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -6.7f, -3.6f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(187.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 194.4f, 196.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.7f, 208.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                lineTo(187.7f, 48.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 201.0f, 55.1f)
                lineToRelative(45.7f, 68.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 0.0f, 8.8f)
                lineTo(201.0f, 200.9f)
                horizontalLineToRelative(0.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 187.7f, 208.0f)
                close()
                moveTo(187.7f, 192.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(42.7f, -64.0f)
                lineTo(187.7f, 64.0f)
                lineTo(40.0f, 64.0f)
                lineTo(40.0f, 192.0f)
                close()
            }
        }
        .build()
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
