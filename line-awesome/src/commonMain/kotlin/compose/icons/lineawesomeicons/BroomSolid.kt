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

public val LineAwesomeIcons.BroomSolid: ImageVector
    get() {
        if (_broomSolid != null) {
            return _broomSolid!!
        }
        _broomSolid = Builder(name = "BroomSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.281f, 2.281f)
                lineTo(18.281f, 12.281f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 10.969f)
                lineTo(16.969f, 10.938f)
                curveTo(16.328f, 10.367f, 15.492f, 10.094f, 14.688f, 10.094f)
                curveTo(13.883f, 10.094f, 13.105f, 10.395f, 12.5f, 11.0f)
                lineTo(12.344f, 11.125f)
                lineTo(11.844f, 11.625f)
                lineTo(11.5f, 11.906f)
                lineTo(2.375f, 19.0f)
                lineTo(1.5f, 19.719f)
                lineTo(12.281f, 30.5f)
                lineTo(13.0f, 29.625f)
                lineTo(20.063f, 20.563f)
                lineTo(20.094f, 20.594f)
                lineTo(21.094f, 19.594f)
                lineTo(21.125f, 19.594f)
                lineTo(21.156f, 19.563f)
                curveTo(22.297f, 18.277f, 22.305f, 16.305f, 21.094f, 15.094f)
                lineTo(19.719f, 13.719f)
                lineTo(29.719f, 3.719f)
                close()
                moveTo(14.688f, 12.094f)
                curveTo(14.996f, 12.086f, 15.336f, 12.191f, 15.594f, 12.406f)
                curveTo(15.605f, 12.414f, 15.613f, 12.43f, 15.625f, 12.438f)
                lineTo(19.688f, 16.5f)
                curveTo(20.063f, 16.875f, 20.098f, 17.672f, 19.688f, 18.188f)
                curveTo(19.672f, 18.207f, 19.672f, 18.23f, 19.656f, 18.25f)
                lineTo(19.344f, 18.531f)
                lineTo(13.563f, 12.75f)
                lineTo(13.906f, 12.406f)
                curveTo(14.098f, 12.215f, 14.379f, 12.102f, 14.688f, 12.094f)
                close()
                moveTo(12.031f, 14.031f)
                lineTo(17.969f, 19.969f)
                lineTo(12.094f, 27.469f)
                lineTo(10.656f, 26.031f)
                lineTo(12.813f, 23.781f)
                lineTo(11.375f, 22.406f)
                lineTo(9.25f, 24.625f)
                lineTo(7.938f, 23.313f)
                lineTo(11.813f, 19.406f)
                lineTo(10.406f, 18.0f)
                lineTo(6.5f, 21.875f)
                lineTo(4.531f, 19.906f)
                close()
            }
        }
        .build()
        return _broomSolid!!
    }

private var _broomSolid: ImageVector? = null
