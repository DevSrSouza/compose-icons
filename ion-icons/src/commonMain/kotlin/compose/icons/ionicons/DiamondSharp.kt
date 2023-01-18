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

public val IonIcons.DiamondSharp: ImageVector
    get() {
        if (_diamondSharp != null) {
            return _diamondSharp!!
        }
        _diamondSharp = Builder(name = "DiamondSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(396.31f, 32.0f)
                lineToRelative(-132.31f, 0.0f)
                lineToRelative(84.19f, 112.26f)
                lineToRelative(48.12f, -112.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.69f, 32.0f)
                lineToRelative(48.12f, 112.26f)
                lineToRelative(84.19f, -112.26f)
                lineToRelative(-132.31f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 74.67f)
                lineToRelative(-64.0f, 85.33f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(-64.0f, -85.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.95f, 51.06f)
                lineToRelative(-46.69f, 108.94f)
                lineToRelative(111.74f, 0.0f)
                lineToRelative(-65.05f, -108.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(89.05f, 51.06f)
                lineToRelative(-66.05f, 108.94f)
                lineToRelative(112.74f, 0.0f)
                lineToRelative(-46.69f, -108.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.68f, 192.0f)
                lineToRelative(-122.68f, 0.0f)
                lineToRelative(222.8f, 288.0f)
                lineToRelative(0.53f, 0.0f)
                lineToRelative(-100.65f, -288.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(365.32f, 192.0f)
                lineToRelative(-100.65f, 288.0f)
                lineToRelative(0.53f, 0.0f)
                lineToRelative(222.8f, -288.0f)
                lineToRelative(-122.68f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(329.39f, 192.0f)
                lineToRelative(-146.78f, 0.0f)
                lineToRelative(73.39f, 208.0f)
                lineToRelative(73.39f, -208.0f)
                close()
            }
        }
        .build()
        return _diamondSharp!!
    }

private var _diamondSharp: ImageVector? = null
