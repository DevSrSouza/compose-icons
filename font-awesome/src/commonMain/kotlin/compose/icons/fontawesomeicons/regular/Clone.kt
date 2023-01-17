package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Clone: ImageVector
    get() {
        if (_clone != null) {
            return _clone!!
        }
        _clone = Builder(name = "Clone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 464.0f)
                horizontalLineTo(288.0f)
                curveTo(296.8f, 464.0f, 304.0f, 456.8f, 304.0f, 448.0f)
                verticalLineTo(384.0f)
                horizontalLineTo(352.0f)
                verticalLineTo(448.0f)
                curveTo(352.0f, 483.3f, 323.3f, 512.0f, 288.0f, 512.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 512.0f, 0.0f, 483.3f, 0.0f, 448.0f)
                verticalLineTo(224.0f)
                curveTo(0.0f, 188.7f, 28.65f, 160.0f, 64.0f, 160.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(64.0f)
                curveTo(55.16f, 208.0f, 48.0f, 215.2f, 48.0f, 224.0f)
                verticalLineTo(448.0f)
                curveTo(48.0f, 456.8f, 55.16f, 464.0f, 64.0f, 464.0f)
                close()
                moveTo(160.0f, 64.0f)
                curveTo(160.0f, 28.65f, 188.7f, 0.0f, 224.0f, 0.0f)
                horizontalLineTo(448.0f)
                curveTo(483.3f, 0.0f, 512.0f, 28.65f, 512.0f, 64.0f)
                verticalLineTo(288.0f)
                curveTo(512.0f, 323.3f, 483.3f, 352.0f, 448.0f, 352.0f)
                horizontalLineTo(224.0f)
                curveTo(188.7f, 352.0f, 160.0f, 323.3f, 160.0f, 288.0f)
                verticalLineTo(64.0f)
                close()
                moveTo(224.0f, 304.0f)
                horizontalLineTo(448.0f)
                curveTo(456.8f, 304.0f, 464.0f, 296.8f, 464.0f, 288.0f)
                verticalLineTo(64.0f)
                curveTo(464.0f, 55.16f, 456.8f, 48.0f, 448.0f, 48.0f)
                horizontalLineTo(224.0f)
                curveTo(215.2f, 48.0f, 208.0f, 55.16f, 208.0f, 64.0f)
                verticalLineTo(288.0f)
                curveTo(208.0f, 296.8f, 215.2f, 304.0f, 224.0f, 304.0f)
                close()
            }
        }
        .build()
        return _clone!!
    }

private var _clone: ImageVector? = null
