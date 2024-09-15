package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.GlassMartiniAltSolid: ImageVector
    get() {
        if (_glassMartiniAltSolid != null) {
            return _glassMartiniAltSolid!!
        }
        _glassMartiniAltSolid = Builder(name = "GlassMartiniAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.0f)
                curveTo(5.465f, 4.0f, 3.0f, 6.465f, 3.0f, 9.5f)
                curveTo(3.0f, 12.535f, 5.465f, 15.0f, 8.5f, 15.0f)
                curveTo(9.313f, 15.0f, 10.078f, 14.797f, 10.781f, 14.469f)
                lineTo(16.0f, 21.344f)
                lineTo(16.0f, 27.0f)
                lineTo(12.0f, 27.0f)
                lineTo(12.0f, 29.0f)
                lineTo(22.0f, 29.0f)
                lineTo(22.0f, 27.0f)
                lineTo(18.0f, 27.0f)
                lineTo(18.0f, 21.344f)
                lineTo(26.813f, 9.719f)
                lineTo(27.0f, 9.438f)
                lineTo(27.0f, 8.0f)
                lineTo(13.75f, 8.0f)
                curveTo(13.145f, 5.68f, 10.984f, 4.0f, 8.5f, 4.0f)
                close()
                moveTo(8.5f, 6.0f)
                curveTo(9.891f, 6.0f, 11.09f, 6.84f, 11.625f, 8.0f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 9.438f)
                lineTo(7.188f, 9.719f)
                lineTo(9.531f, 12.813f)
                curveTo(9.188f, 12.934f, 8.836f, 13.0f, 8.5f, 13.0f)
                curveTo(6.535f, 13.0f, 5.0f, 11.465f, 5.0f, 9.5f)
                curveTo(5.0f, 7.535f, 6.535f, 6.0f, 8.5f, 6.0f)
                close()
                moveTo(9.938f, 10.0f)
                lineTo(24.063f, 10.0f)
                lineTo(22.563f, 12.0f)
                lineTo(13.5f, 12.0f)
                lineTo(15.0f, 14.0f)
                lineTo(21.031f, 14.0f)
                lineTo(17.0f, 19.344f)
                close()
            }
        }
        .build()
        return _glassMartiniAltSolid!!
    }

private var _glassMartiniAltSolid: ImageVector? = null
