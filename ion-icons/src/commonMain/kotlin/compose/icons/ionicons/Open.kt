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

public val IonIcons.Open: ImageVector
    get() {
        if (_open != null) {
            return _open!!
        }
        _open = Builder(name = "Open", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.31f, -27.31f)
                lineTo(370.63f, 118.75f)
                arcTo(55.7f, 55.7f, 0.0f, false, false, 344.0f, 112.0f)
                horizontalLineTo(104.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineTo(408.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineTo(344.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, -56.0f)
                verticalLineTo(168.0f)
                arcToRelative(55.7f, 55.7f, 0.0f, false, false, -6.75f, -26.63f)
                lineTo(235.31f, 299.31f)
                arcTo(15.92f, 15.92f, 0.0f, false, true, 224.0f, 304.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 48.0f)
                horizontalLineTo(336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineToRelative(73.37f)
                lineToRelative(-38.74f, 38.75f)
                arcToRelative(56.35f, 56.35f, 0.0f, false, true, 22.62f, 22.62f)
                lineTo(432.0f, 102.63f)
                verticalLineTo(176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 448.0f, 48.0f)
                close()
            }
        }
        .build()
        return _open!!
    }

private var _open: ImageVector? = null
