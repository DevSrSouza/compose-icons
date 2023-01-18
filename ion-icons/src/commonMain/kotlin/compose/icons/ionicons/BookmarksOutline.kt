package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BookmarksOutline: ImageVector
    get() {
        if (_bookmarksOutline != null) {
            return _bookmarksOutline!!
        }
        _bookmarksOutline = Builder(name = "BookmarksOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                verticalLineTo(64.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, true, 48.0f, -48.0f)
                horizontalLineTo(400.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, true, 48.0f, 48.0f)
                verticalLineTo(432.0f)
                lineToRelative(-80.0f, -64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 96.0f)
                horizontalLineTo(112.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, false, -48.0f, 48.0f)
                verticalLineTo(496.0f)
                lineTo(216.0f, 368.0f)
                lineTo(368.0f, 496.0f)
                verticalLineTo(144.0f)
                arcTo(48.14f, 48.14f, 0.0f, false, false, 320.0f, 96.0f)
                close()
            }
        }
        .build()
        return _bookmarksOutline!!
    }

private var _bookmarksOutline: ImageVector? = null
