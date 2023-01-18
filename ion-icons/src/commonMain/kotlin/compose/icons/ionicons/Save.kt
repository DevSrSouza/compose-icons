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

public val IonIcons.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save = Builder(name = "Save", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(465.94f, 119.76f)
                lineToRelative(-73.7f, -73.7f)
                horizontalLineToRelative(0.0f)
                arcTo(47.68f, 47.68f, 0.0f, false, false, 358.3f, 32.0f)
                horizontalLineTo(96.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 32.0f, 96.0f)
                verticalLineTo(416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(153.7f)
                arcTo(47.68f, 47.68f, 0.0f, false, false, 465.94f, 119.76f)
                close()
                moveTo(120.0f, 112.0f)
                horizontalLineTo(296.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 112.0f)
                close()
                moveTo(259.75f, 431.91f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 76.16f, -76.16f)
                arcTo(80.06f, 80.06f, 0.0f, false, true, 259.75f, 431.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 352.0f)
                moveToRelative(-48.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
            }
        }
        .build()
        return _save!!
    }

private var _save: ImageVector? = null
