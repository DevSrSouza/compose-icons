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

public val LineAwesomeIcons.PassportSolid: ImageVector
    get() {
        if (_passportSolid != null) {
            return _passportSolid!!
        }
        _passportSolid = Builder(name = "PassportSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(24.0f, 5.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(12.699f, 8.0f, 10.0f, 10.699f, 10.0f, 14.0f)
                curveTo(10.0f, 17.301f, 12.699f, 20.0f, 16.0f, 20.0f)
                curveTo(19.301f, 20.0f, 22.0f, 17.301f, 22.0f, 14.0f)
                curveTo(22.0f, 10.699f, 19.301f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.688f, 10.094f)
                curveTo(17.172f, 10.176f, 17.625f, 10.324f, 18.031f, 10.563f)
                lineTo(18.094f, 11.281f)
                lineTo(17.625f, 11.094f)
                lineTo(17.25f, 11.406f)
                lineTo(17.313f, 12.313f)
                lineTo(18.281f, 12.031f)
                lineTo(19.469f, 12.406f)
                lineTo(19.156f, 12.938f)
                lineTo(18.438f, 12.5f)
                lineTo(17.656f, 12.625f)
                lineTo(16.906f, 13.188f)
                lineTo(16.469f, 14.5f)
                lineTo(17.313f, 15.188f)
                curveTo(17.313f, 15.188f, 18.203f, 15.031f, 18.25f, 15.031f)
                curveTo(18.297f, 15.031f, 18.625f, 15.844f, 18.625f, 15.844f)
                lineTo(18.125f, 17.375f)
                curveTo(17.512f, 17.758f, 16.785f, 18.0f, 16.0f, 18.0f)
                curveTo(15.766f, 18.0f, 15.535f, 17.945f, 15.313f, 17.906f)
                lineTo(15.125f, 17.594f)
                lineTo(15.594f, 15.844f)
                lineTo(13.813f, 14.5f)
                lineTo(12.156f, 14.5f)
                lineTo(12.031f, 14.25f)
                curveTo(12.027f, 14.164f, 12.0f, 14.086f, 12.0f, 14.0f)
                curveTo(12.0f, 13.785f, 12.031f, 13.578f, 12.063f, 13.375f)
                lineTo(12.906f, 12.719f)
                lineTo(14.688f, 11.875f)
                lineTo(14.406f, 10.719f)
                lineTo(15.188f, 10.563f)
                lineTo(15.531f, 11.063f)
                lineTo(16.875f, 10.813f)
                close()
                moveTo(13.063f, 16.719f)
                lineTo(13.375f, 16.719f)
                lineTo(13.969f, 17.438f)
                curveTo(13.629f, 17.238f, 13.328f, 17.004f, 13.063f, 16.719f)
                close()
                moveTo(10.0f, 22.0f)
                lineTo(10.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 22.0f)
                close()
            }
        }
        .build()
        return _passportSolid!!
    }

private var _passportSolid: ImageVector? = null
