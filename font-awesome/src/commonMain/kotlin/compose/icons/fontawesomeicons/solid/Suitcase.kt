package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Suitcase: ImageVector
    get() {
        if (_suitcase != null) {
            return _suitcase!!
        }
        _suitcase = Builder(name = "Suitcase", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 56.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(336.0f)
                verticalLineTo(56.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                horizontalLineTo(184.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                close()
                moveTo(128.0f, 96.0f)
                verticalLineTo(56.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                horizontalLineTo(328.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                verticalLineTo(96.0f)
                verticalLineToRelative(32.0f)
                verticalLineTo(480.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(128.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(64.0f, 96.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(480.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(448.0f, 480.0f)
                horizontalLineTo(416.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
