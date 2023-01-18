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

public val IonIcons.Bandage: ImageVector
    get() {
        if (_bandage != null) {
            return _bandage!!
        }
        _bandage = Builder(name = "Bandage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(275.8f, 157.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineToRelative(-93.34f, 93.34f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(79.2f, 79.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineTo(355.0f, 258.83f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
                moveTo(219.31f, 267.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 219.31f, 267.31f)
                close()
                moveTo(267.31f, 315.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 267.31f, 315.31f)
                close()
                moveTo(267.31f, 219.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 267.31f, 219.31f)
                close()
                moveTo(315.31f, 267.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 315.31f, 267.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(465.61f, 46.39f)
                arcToRelative(104.38f, 104.38f, 0.0f, false, false, -147.25f, 0.0f)
                lineTo(248.6f, 116.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.2f, 6.58f)
                arcToRelative(35.74f, 35.74f, 0.0f, false, true, 11.69f, -2.54f)
                arcToRelative(47.7f, 47.7f, 0.0f, false, true, 33.94f, 14.06f)
                lineToRelative(79.19f, 79.19f)
                arcToRelative(47.7f, 47.7f, 0.0f, false, true, 14.06f, 33.94f)
                arcToRelative(35.68f, 35.68f, 0.0f, false, true, -2.54f, 11.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.58f, 4.2f)
                lineToRelative(69.89f, -69.76f)
                arcToRelative(104.38f, 104.38f, 0.0f, false, false, 0.0f, -147.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.34f, 386.83f)
                arcToRelative(47.91f, 47.91f, 0.0f, false, true, -33.94f, -14.0f)
                lineTo(141.21f, 293.6f)
                arcToRelative(47.81f, 47.81f, 0.0f, false, true, -9.43f, -13.38f)
                curveToRelative(-4.59f, -9.7f, -1.39f, -25.0f, 2.48f, -36.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.64f, -4.0f)
                lineTo(50.39f, 316.36f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 197.64f, 463.61f)
                lineToRelative(72.75f, -72.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.21f, -6.58f)
                curveTo(262.0f, 385.73f, 257.78f, 386.83f, 254.34f, 386.83f)
                close()
            }
        }
        .build()
        return _bandage!!
    }

private var _bandage: ImageVector? = null
