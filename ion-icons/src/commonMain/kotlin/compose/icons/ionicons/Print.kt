package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 112.0f)
                horizontalLineTo(106.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -58.0f, 58.0f)
                verticalLineTo(328.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(39.68f)
                arcTo(40.32f, 40.32f, 0.0f, false, false, 152.32f, 464.0f)
                horizontalLineTo(359.68f)
                arcTo(40.32f, 40.32f, 0.0f, false, false, 400.0f, 423.68f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, -56.0f)
                verticalLineTo(168.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 408.0f, 112.0f)
                close()
                moveTo(368.0f, 423.68f)
                arcToRelative(8.35f, 8.35f, 0.0f, false, true, -8.32f, 8.32f)
                horizontalLineTo(152.32f)
                arcToRelative(8.35f, 8.35f, 0.0f, false, true, -8.32f, -8.32f)
                verticalLineTo(264.32f)
                arcToRelative(8.35f, 8.35f, 0.0f, false, true, 8.32f, -8.32f)
                horizontalLineTo(359.68f)
                arcToRelative(8.35f, 8.35f, 0.0f, false, true, 8.32f, 8.32f)
                close()
                moveTo(394.0f, 207.92f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 394.0f, 207.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.0f, 48.0f)
                horizontalLineTo(168.0f)
                arcToRelative(56.09f, 56.09f, 0.0f, false, false, -55.42f, 48.0f)
                horizontalLineTo(399.42f)
                arcTo(56.09f, 56.09f, 0.0f, false, false, 344.0f, 48.0f)
                close()
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null
