package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.BrowserNotSupported: ImageVector
    get() {
        if (_browserNotSupported != null) {
            return _browserNotSupported!!
        }
        _browserNotSupported = Builder(name = "BrowserNotSupported", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                verticalLineToRelative(10.5f)
                lineToRelative(1.95f, 1.95f)
                curveTo(20.98f, 18.3f, 21.0f, 18.15f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(6.5f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.22f, 3.32f)
                lineTo(1.95f, 4.59f)
                lineTo(3.0f, 5.64f)
                lineTo(3.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.36f)
                lineToRelative(2.06f, 2.06f)
                lineToRelative(1.27f, -1.27f)
                lineTo(3.22f, 3.32f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.64f)
                lineTo(15.36f, 18.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _browserNotSupported!!
    }

private var _browserNotSupported: ImageVector? = null
