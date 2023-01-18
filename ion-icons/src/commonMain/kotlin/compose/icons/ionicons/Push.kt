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

public val IonIcons.Push: ImageVector
    get() {
        if (_push != null) {
            return _push!!
        }
        _push = Builder(name = "Push", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(376.0f, 352.0f)
                horizontalLineTo(272.0f)
                verticalLineTo(198.63f)
                lineToRelative(52.69f, 52.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, -22.62f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 22.62f)
                lineTo(240.0f, 198.63f)
                verticalLineTo(352.0f)
                horizontalLineTo(136.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -56.0f, -56.0f)
                verticalLineTo(88.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, 56.0f, -56.0f)
                horizontalLineTo(376.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, 56.0f, 56.0f)
                verticalLineTo(296.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 376.0f, 352.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                verticalLineTo(352.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _push!!
    }

private var _push: ImageVector? = null
