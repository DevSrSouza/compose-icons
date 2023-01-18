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

public val IonIcons.MaleFemale: ImageVector
    get() {
        if (_maleFemale != null) {
            return _maleFemale!!
        }
        _maleFemale = Builder(name = "MaleFemale", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(426.0f, 16.0f)
                horizontalLineTo(352.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f)
                horizontalLineToRelative(20.89f)
                lineToRelative(-37.1f, 37.09f)
                arcTo(157.68f, 157.68f, 0.0f, false, false, 216.0f, 42.0f)
                curveTo(128.88f, 42.0f, 58.0f, 112.88f, 58.0f, 200.0f)
                curveToRelative(0.0f, 79.66f, 59.26f, 145.72f, 136.0f, 156.46f)
                verticalLineTo(394.0f)
                horizontalLineTo(166.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                verticalLineTo(438.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                horizontalLineTo(238.0f)
                verticalLineTo(356.46f)
                curveToRelative(76.74f, -10.74f, 136.0f, -76.8f, 136.0f, -156.46f)
                arcToRelative(157.15f, 157.15f, 0.0f, false, false, -14.0f, -64.92f)
                lineToRelative(44.0f, -44.0f)
                verticalLineTo(112.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                verticalLineTo(38.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 426.0f, 16.0f)
                close()
                moveTo(216.0f, 314.0f)
                arcTo(114.0f, 114.0f, 0.0f, true, true, 330.0f, 200.0f)
                arcTo(114.13f, 114.13f, 0.0f, false, true, 216.0f, 314.0f)
                close()
            }
        }
        .build()
        return _maleFemale!!
    }

private var _maleFemale: ImageVector? = null
