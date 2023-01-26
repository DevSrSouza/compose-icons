package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) {
            return _labelImportant!!
        }
        _labelImportant = Builder(name = "LabelImportant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                horizontalLineTo(7.89f)
                lineToRelative(3.57f, 5.0f)
                lineToRelative(-3.57f, 5.0f)
                horizontalLineTo(15.0f)
                lineToRelative(3.55f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.63f, 5.84f)
                curveTo(16.27f, 5.33f, 15.67f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(4.0f)
                lineToRelative(5.0f, 7.0f)
                lineToRelative(-5.0f, 6.99f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.67f, 0.0f, 1.27f, -0.32f, 1.63f, -0.83f)
                lineTo(21.0f, 12.0f)
                lineToRelative(-4.37f, -6.16f)
                close()
                moveTo(15.0f, 17.0f)
                horizontalLineTo(7.89f)
                lineToRelative(3.57f, -5.0f)
                lineToRelative(-3.57f, -5.0f)
                horizontalLineTo(15.0f)
                lineToRelative(3.55f, 5.0f)
                lineTo(15.0f, 17.0f)
                close()
            }
        }
        .build()
        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
