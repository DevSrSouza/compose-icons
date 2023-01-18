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

public val IonIcons.LogoSlack: ImageVector
    get() {
        if (_logoSlack != null) {
            return _logoSlack!!
        }
        _logoSlack = Builder(name = "LogoSlack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.12f, 315.1f)
                arcTo(47.06f, 47.06f, 0.0f, true, true, 79.06f, 268.0f)
                horizontalLineToRelative(47.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.84f, 315.1f)
                arcToRelative(47.06f, 47.06f, 0.0f, false, true, 94.12f, 0.0f)
                verticalLineTo(432.94f)
                arcToRelative(47.06f, 47.06f, 0.0f, true, true, -94.12f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.9f, 126.12f)
                arcTo(47.06f, 47.06f, 0.0f, true, true, 244.0f, 79.06f)
                verticalLineToRelative(47.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.9f, 149.84f)
                arcToRelative(47.06f, 47.06f, 0.0f, false, true, 0.0f, 94.12f)
                horizontalLineTo(79.06f)
                arcToRelative(47.06f, 47.06f, 0.0f, false, true, 0.0f, -94.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(385.88f, 196.9f)
                arcTo(47.06f, 47.06f, 0.0f, true, true, 432.94f, 244.0f)
                horizontalLineTo(385.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.16f, 196.9f)
                arcToRelative(47.06f, 47.06f, 0.0f, false, true, -94.12f, 0.0f)
                verticalLineTo(79.06f)
                arcToRelative(47.06f, 47.06f, 0.0f, true, true, 94.12f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(315.1f, 385.88f)
                arcTo(47.06f, 47.06f, 0.0f, true, true, 268.0f, 432.94f)
                verticalLineTo(385.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(315.1f, 362.16f)
                arcToRelative(47.06f, 47.06f, 0.0f, false, true, 0.0f, -94.12f)
                horizontalLineTo(432.94f)
                arcToRelative(47.06f, 47.06f, 0.0f, true, true, 0.0f, 94.12f)
                close()
            }
        }
        .build()
        return _logoSlack!!
    }

private var _logoSlack: ImageVector? = null
