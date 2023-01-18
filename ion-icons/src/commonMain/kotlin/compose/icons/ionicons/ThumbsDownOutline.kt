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

public val IonIcons.ThumbsDownOutline: ImageVector
    get() {
        if (_thumbsDownOutline != null) {
            return _thumbsDownOutline!!
        }
        _thumbsDownOutline = Builder(name = "ThumbsDownOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 53.84f)
                reflectiveCurveTo(208.0f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveToRelative(74.0f, 16.0f, 96.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 64.0f, 64.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -64.0f, 64.0f)
                horizontalLineTo(386.0f)
                arcToRelative(32.34f, 32.34f, 0.0f, false, false, -27.37f, 15.4f)
                reflectiveCurveTo(350.0f, 290.19f, 324.0f, 335.22f)
                reflectiveCurveTo(248.0f, 448.0f, 240.0f, 464.0f)
                curveToRelative(-29.0f, 0.0f, -43.0f, -22.0f, -34.0f, -47.71f)
                curveToRelative(10.28f, -29.39f, 23.71f, -54.38f, 27.46f, -87.09f)
                curveToRelative(0.54f, -4.78f, -3.14f, -12.0f, -8.0f, -12.0f)
                lineTo(96.0f, 307.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 241.0f)
                lineToRelative(80.0f, 2.0f)
                curveToRelative(20.0f, 1.84f, 32.0f, 12.4f, 32.0f, 30.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 17.6f, -14.0f, 28.84f, -32.0f, 30.0f)
                lineToRelative(-80.0f, 4.0f)
                curveToRelative(-17.6f, 0.0f, -32.0f, -16.4f, -32.0f, -34.0f)
                verticalLineToRelative(-0.17f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 241.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 176.0f)
                lineToRelative(112.0f, 2.0f)
                curveToRelative(18.0f, 0.84f, 32.0f, 12.41f, 32.0f, 30.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 17.61f, -14.0f, 28.86f, -32.0f, 30.0f)
                lineTo(64.0f, 240.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 64.0f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 48.0f)
                lineToRelative(64.0f, 3.0f)
                curveToRelative(21.0f, 1.84f, 32.0f, 11.4f, 32.0f, 29.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 17.6f, -14.4f, 30.0f, -32.0f, 30.0f)
                lineToRelative(-64.0f, 2.0f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 80.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 112.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 112.0f)
                lineToRelative(96.0f, 2.0f)
                curveToRelative(19.0f, 0.84f, 32.0f, 12.4f, 32.0f, 30.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 17.6f, -13.0f, 28.84f, -32.0f, 30.0f)
                lineToRelative(-96.0f, 2.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, -32.0f, -32.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 80.0f, 112.0f)
                close()
            }
        }
        .build()
        return _thumbsDownOutline!!
    }

private var _thumbsDownOutline: ImageVector? = null
