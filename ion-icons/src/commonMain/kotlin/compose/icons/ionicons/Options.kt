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

public val IonIcons.Options: ImageVector
    get() {
        if (_options != null) {
            return _options!!
        }
        _options = Builder(name = "Options", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 144.0f)
                horizontalLineTo(290.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.5f, 0.0f)
                horizontalLineTo(448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                horizontalLineTo(381.25f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -90.5f, 0.0f)
                horizontalLineTo(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 368.0f)
                horizontalLineTo(381.25f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -90.5f, 0.0f)
                horizontalLineTo(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineTo(290.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.5f, 0.0f)
                horizontalLineTo(448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 240.0f)
                horizontalLineTo(221.25f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -90.5f, 0.0f)
                horizontalLineTo(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineToRelative(66.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.5f, 0.0f)
                horizontalLineTo(448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _options!!
    }

private var _options: ImageVector? = null
