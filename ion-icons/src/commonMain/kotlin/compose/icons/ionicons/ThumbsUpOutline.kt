package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ThumbsUpOutline: ImageVector
    get() {
        if (_thumbsUpOutline != null) {
            return _thumbsUpOutline!!
        }
        _thumbsUpOutline = Builder(name = "ThumbsUpOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 458.16f)
                reflectiveCurveTo(304.0f, 464.0f, 256.0f, 464.0f)
                reflectiveCurveToRelative(-74.0f, -16.0f, -96.0f, -32.0f)
                horizontalLineTo(96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -64.0f, -64.0f)
                verticalLineTo(320.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 64.0f, -64.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(32.34f, 32.34f, 0.0f, false, false, 27.37f, -15.4f)
                reflectiveCurveTo(162.0f, 221.81f, 188.0f, 176.78f)
                reflectiveCurveTo(264.0f, 64.0f, 272.0f, 48.0f)
                curveToRelative(29.0f, 0.0f, 43.0f, 22.0f, 34.0f, 47.71f)
                curveToRelative(-10.28f, 29.39f, -23.71f, 54.38f, -27.46f, 87.09f)
                curveToRelative(-0.54f, 4.78f, 3.14f, 12.0f, 7.95f, 12.0f)
                lineTo(416.0f, 205.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 271.0f)
                lineToRelative(-80.0f, -2.0f)
                curveToRelative(-20.0f, -1.84f, -32.0f, -12.4f, -32.0f, -30.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -17.6f, 14.0f, -28.84f, 32.0f, -30.0f)
                lineToRelative(80.0f, -4.0f)
                curveToRelative(17.6f, 0.0f, 32.0f, 16.4f, 32.0f, 34.0f)
                verticalLineToRelative(0.17f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 416.0f, 271.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 336.0f)
                lineToRelative(-112.0f, -2.0f)
                curveToRelative(-18.0f, -0.84f, -32.0f, -12.41f, -32.0f, -30.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -17.61f, 14.0f, -28.86f, 32.0f, -30.0f)
                lineToRelative(112.0f, -2.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 32.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 448.0f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 464.0f)
                lineToRelative(-64.0f, -3.0f)
                curveToRelative(-21.0f, -1.84f, -32.0f, -11.4f, -32.0f, -29.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -17.6f, 14.4f, -30.0f, 32.0f, -30.0f)
                lineToRelative(64.0f, -2.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, 32.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 400.0f, 464.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(432.0f, 400.0f)
                lineToRelative(-96.0f, -2.0f)
                curveToRelative(-19.0f, -0.84f, -32.0f, -12.4f, -32.0f, -30.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -17.6f, 13.0f, -28.84f, 32.0f, -30.0f)
                lineToRelative(96.0f, -2.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, 32.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 432.0f, 400.0f)
                close()
            }
        }
        .build()
        return _thumbsUpOutline!!
    }

private var _thumbsUpOutline: ImageVector? = null
