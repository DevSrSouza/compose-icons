package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Cairometro: ImageVector
    get() {
        if (_cairometro != null) {
            return _cairometro!!
        }
        _cairometro = Builder(name = "Cairometro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.397f, 4.14f)
                horizontalLineToRelative(0.882f)
                verticalLineToRelative(0.881f)
                horizontalLineToRelative(-0.882f)
                close()
                moveTo(10.769f, 4.14f)
                horizontalLineToRelative(0.883f)
                verticalLineToRelative(0.881f)
                horizontalLineToRelative(-0.883f)
                close()
                moveTo(15.684f, 5.195f)
                verticalLineToRelative(3.402f)
                horizontalLineToRelative(-1.386f)
                lineTo(14.298f, 5.195f)
                horizontalLineToRelative(-0.84f)
                verticalLineToRelative(1.763f)
                horizontalLineToRelative(-2.983f)
                lineTo(10.475f, 5.196f)
                horizontalLineToRelative(-0.84f)
                verticalLineToRelative(3.402f)
                lineTo(8.543f, 8.598f)
                verticalLineToRelative(0.84f)
                horizontalLineToRelative(1.911f)
                lineTo(10.454f, 7.82f)
                horizontalLineToRelative(2.983f)
                verticalLineToRelative(1.617f)
                horizontalLineToRelative(5.44f)
                lineTo(18.877f, 5.195f)
                close()
                moveTo(18.036f, 8.59f)
                horizontalLineToRelative(-1.512f)
                lineTo(16.524f, 6.028f)
                horizontalLineToRelative(1.512f)
                close()
                moveTo(5.173f, 5.195f)
                verticalLineToRelative(2.604f)
                horizontalLineToRelative(2.353f)
                verticalLineToRelative(0.805f)
                lineTo(5.173f, 8.604f)
                verticalLineToRelative(0.833f)
                horizontalLineToRelative(3.193f)
                lineTo(8.366f, 5.195f)
                close()
                moveTo(7.512f, 6.952f)
                lineTo(5.999f, 6.952f)
                verticalLineToRelative(-0.924f)
                horizontalLineToRelative(1.513f)
                close()
                moveTo(4.872f, 19.129f)
                lineTo(4.872f, 9.726f)
                horizontalLineToRelative(4.175f)
                lineTo(12.0f, 12.68f)
                lineToRelative(2.954f, -2.953f)
                horizontalLineToRelative(4.176f)
                verticalLineToRelative(9.403f)
                horizontalLineToRelative(-4.176f)
                verticalLineToRelative(-3.442f)
                lineTo(12.0f, 18.754f)
                lineToRelative(-2.952f, -3.048f)
                verticalLineToRelative(3.424f)
                close()
                moveTo(12.0f, 0.0f)
                lineTo(8.485f, 3.515f)
                horizontalLineToRelative(-4.97f)
                verticalLineToRelative(4.97f)
                lineTo(0.0f, 12.0f)
                lineToRelative(3.515f, 3.515f)
                verticalLineToRelative(4.97f)
                horizontalLineToRelative(4.97f)
                lineTo(12.0f, 24.0f)
                lineToRelative(3.515f, -3.515f)
                horizontalLineToRelative(4.97f)
                verticalLineToRelative(-4.97f)
                lineTo(24.0f, 12.0f)
                lineToRelative(-3.515f, -3.515f)
                verticalLineToRelative(-4.97f)
                horizontalLineToRelative(-4.97f)
                close()
                moveTo(12.0f, 1.708f)
                lineToRelative(3.014f, 3.015f)
                horizontalLineToRelative(4.263f)
                verticalLineToRelative(4.263f)
                lineTo(22.292f, 12.0f)
                lineToRelative(-3.015f, 3.014f)
                verticalLineToRelative(4.263f)
                horizontalLineToRelative(-4.263f)
                lineTo(12.0f, 22.292f)
                lineToRelative(-3.014f, -3.015f)
                lineTo(4.723f, 19.277f)
                verticalLineToRelative(-4.263f)
                lineTo(1.708f, 12.0f)
                lineToRelative(3.015f, -3.014f)
                lineTo(4.723f, 4.723f)
                horizontalLineToRelative(4.263f)
                close()
            }
        }
        .build()
        return _cairometro!!
    }

private var _cairometro: ImageVector? = null
