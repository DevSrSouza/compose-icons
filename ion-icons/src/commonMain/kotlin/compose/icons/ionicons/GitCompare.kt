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

public val IonIcons.GitCompare: ImageVector
    get() {
        if (_gitCompare != null) {
            return _gitCompare!!
        }
        _gitCompare = Builder(name = "GitCompare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.31f, 340.69f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 191.0f, 352.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(171.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                verticalLineTo(152.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -64.0f, -1.16f)
                verticalLineTo(356.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, 92.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.31f, 11.31f)
                lineToRelative(64.0f, -64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.62f)
                close()
                moveTo(112.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 80.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 112.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 360.61f)
                verticalLineTo(156.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, -92.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.31f, -11.31f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f)
                lineToRelative(64.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 320.0f, 160.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineTo(360.61f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(400.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 400.0f, 448.0f)
                close()
            }
        }
        .build()
        return _gitCompare!!
    }

private var _gitCompare: ImageVector? = null
