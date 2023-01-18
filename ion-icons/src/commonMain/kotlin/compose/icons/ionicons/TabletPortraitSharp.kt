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

public val IonIcons.TabletPortraitSharp: ImageVector
    get() {
        if (_tabletPortraitSharp != null) {
            return _tabletPortraitSharp!!
        }
        _tabletPortraitSharp = Builder(name = "TabletPortraitSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(430.0f, 0.0f)
                horizontalLineTo(82.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 64.0f, 18.0f)
                verticalLineTo(494.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, 18.0f)
                horizontalLineTo(430.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, -18.0f)
                verticalLineTo(18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 430.0f, 0.0f)
                close()
                moveTo(100.0f, 448.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(412.0f)
                verticalLineTo(448.0f)
                close()
            }
        }
        .build()
        return _tabletPortraitSharp!!
    }

private var _tabletPortraitSharp: ImageVector? = null
