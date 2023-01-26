package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ChangeHistory: ImageVector
    get() {
        if (_changeHistory != null) {
            return _changeHistory!!
        }
        _changeHistory = Builder(name = "ChangeHistory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.77f)
                lineTo(18.39f, 18.0f)
                horizontalLineTo(5.61f)
                lineTo(12.0f, 7.77f)
                moveTo(12.0f, 4.0f)
                lineTo(2.0f, 20.0f)
                horizontalLineToRelative(20.0f)
                lineTo(12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _changeHistory!!
    }

private var _changeHistory: ImageVector? = null
