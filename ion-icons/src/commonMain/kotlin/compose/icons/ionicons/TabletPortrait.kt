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

public val IonIcons.TabletPortrait: ImageVector
    get() {
        if (_tabletPortrait != null) {
            return _tabletPortrait!!
        }
        _tabletPortrait = Builder(name = "TabletPortrait", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 512.0f)
                horizontalLineTo(128.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, -64.0f)
                verticalLineTo(64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 128.0f, 0.0f)
                horizontalLineTo(384.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, 64.0f, 64.0f)
                verticalLineTo(448.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 384.0f, 512.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 96.0f, 64.0f)
                verticalLineTo(448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 0.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, 64.0f, 64.0f)
                verticalLineTo(448.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, 64.0f)
                horizontalLineTo(128.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, -64.0f)
                verticalLineTo(64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 128.0f, 0.0f)
                horizontalLineTo(384.0f)
                moveTo(128.0f, 480.0f)
                horizontalLineTo(384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                horizontalLineTo(128.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 96.0f, 64.0f)
                verticalLineTo(448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                moveToRelative(0.0f, -16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineTo(384.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineTo(448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _tabletPortrait!!
    }

private var _tabletPortrait: ImageVector? = null
