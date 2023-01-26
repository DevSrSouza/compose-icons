package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Upgrade: ImageVector
    get() {
        if (_upgrade != null) {
            return _upgrade!!
        }
        _upgrade = Builder(name = "Upgrade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(11.0f, 7.99f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.99f)
                horizontalLineToRelative(3.0f)
                lineTo(12.0f, 4.0f)
                lineTo(8.0f, 7.99f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _upgrade!!
    }

private var _upgrade: ImageVector? = null
