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

public val OutlineGroup.SwitchRight: ImageVector
    get() {
        if (_switchRight != null) {
            return _switchRight!!
        }
        _switchRight = Builder(name = "SwitchRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 15.38f)
                verticalLineTo(8.62f)
                lineTo(18.88f, 12.0f)
                lineTo(15.5f, 15.38f)
                moveTo(14.0f, 19.0f)
                lineToRelative(7.0f, -7.0f)
                lineToRelative(-7.0f, -7.0f)
                verticalLineTo(19.0f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(10.0f, 19.0f)
                verticalLineTo(5.0f)
                lineToRelative(-7.0f, 7.0f)
                lineTo(10.0f, 19.0f)
                close()
            }
        }
        .build()
        return _switchRight!!
    }

private var _switchRight: ImageVector? = null
