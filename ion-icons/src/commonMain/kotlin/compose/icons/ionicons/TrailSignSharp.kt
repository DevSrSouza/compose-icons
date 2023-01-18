package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TrailSignSharp: ImageVector
    get() {
        if (_trailSignSharp != null) {
            return _trailSignSharp!!
        }
        _trailSignSharp = Builder(name = "TrailSignSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.63f, 336.0f)
                lineToRelative(-80.0f, -80.0f)
                horizontalLineTo(278.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(278.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(234.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(89.37f)
                lineToRelative(-80.0f, 80.0f)
                lineToRelative(80.0f, 80.0f)
                horizontalLineTo(234.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(234.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(44.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(422.63f)
                close()
            }
        }
        .build()
        return _trailSignSharp!!
    }

private var _trailSignSharp: ImageVector? = null
