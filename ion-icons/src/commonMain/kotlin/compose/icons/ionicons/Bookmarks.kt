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

public val IonIcons.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) {
            return _bookmarks!!
        }
        _bookmarks = Builder(name = "Bookmarks", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 0.0f)
                horizontalLineTo(176.0f)
                arcToRelative(64.11f, 64.11f, 0.0f, false, false, -62.0f, 48.0f)
                horizontalLineTo(342.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, 74.0f, 74.0f)
                verticalLineTo(426.89f)
                lineToRelative(22.0f, 17.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.34f, 0.5f)
                arcTo(16.41f, 16.41f, 0.0f, false, false, 464.0f, 431.57f)
                verticalLineTo(64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 400.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 80.0f)
                horizontalLineTo(112.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineTo(495.62f)
                arcTo(16.36f, 16.36f, 0.0f, false, false, 54.6f, 509.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.71f, -0.71f)
                lineTo(216.0f, 388.92f)
                lineTo(357.69f, 508.24f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.6f, 0.79f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 384.0f, 495.59f)
                verticalLineTo(144.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 320.0f, 80.0f)
                close()
            }
        }
        .build()
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
