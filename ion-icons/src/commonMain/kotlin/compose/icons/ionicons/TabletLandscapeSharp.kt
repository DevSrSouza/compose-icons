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

public val IonIcons.TabletLandscapeSharp: ImageVector
    get() {
        if (_tabletLandscapeSharp != null) {
            return _tabletLandscapeSharp!!
        }
        _tabletLandscapeSharp = Builder(name = "TabletLandscapeSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 82.0f)
                verticalLineTo(430.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, 18.0f)
                horizontalLineTo(494.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, -18.0f)
                verticalLineTo(82.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, -18.0f)
                horizontalLineTo(18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 0.0f, 82.0f)
                close()
                moveTo(448.0f, 412.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(100.0f)
                horizontalLineTo(448.0f)
                close()
            }
        }
        .build()
        return _tabletLandscapeSharp!!
    }

private var _tabletLandscapeSharp: ImageVector? = null
