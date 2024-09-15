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

public val LineAwesomeIcons.Medapps: ImageVector
    get() {
        if (_medapps != null) {
            return _medapps!!
        }
        _medapps = Builder(name = "Medapps", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(11.514f, 2.0f, 8.0f, 5.443f, 8.0f, 9.838f)
                curveTo(8.0f, 11.977f, 8.856f, 14.573f, 10.182f, 16.455f)
                lineTo(10.316f, 16.646f)
                curveTo(11.105f, 17.763f, 12.0f, 19.03f, 12.0f, 20.0f)
                curveTo(12.0f, 20.552f, 12.447f, 21.0f, 13.0f, 21.0f)
                curveTo(13.553f, 21.0f, 14.0f, 20.552f, 14.0f, 20.0f)
                curveTo(14.0f, 18.395f, 12.912f, 16.853f, 11.951f, 15.492f)
                lineTo(11.816f, 15.303f)
                curveTo(10.729f, 13.761f, 10.0f, 11.565f, 10.0f, 9.838f)
                curveTo(10.0f, 6.565f, 12.636f, 4.0f, 16.0f, 4.0f)
                curveTo(19.364f, 4.0f, 22.0f, 6.565f, 22.0f, 9.838f)
                curveTo(22.0f, 11.564f, 21.271f, 13.761f, 20.184f, 15.303f)
                lineTo(20.057f, 15.482f)
                curveTo(19.238f, 16.637f, 18.0f, 18.383f, 18.0f, 20.0f)
                curveTo(18.0f, 20.552f, 18.447f, 21.0f, 19.0f, 21.0f)
                curveTo(19.553f, 21.0f, 20.0f, 20.552f, 20.0f, 20.0f)
                curveTo(20.0f, 19.02f, 21.098f, 17.471f, 21.688f, 16.639f)
                lineTo(21.816f, 16.455f)
                curveTo(23.143f, 14.573f, 24.0f, 11.977f, 24.0f, 9.838f)
                curveTo(24.0f, 5.443f, 20.486f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.217f, 10.0f)
                curveTo(15.755f, 10.079f, 15.712f, 13.195f, 15.471f, 14.379f)
                curveTo(14.988f, 13.712f, 14.916f, 12.617f, 14.475f, 12.527f)
                curveTo(14.139f, 12.527f, 13.96f, 13.593f, 13.771f, 14.23f)
                lineTo(12.123f, 14.479f)
                curveTo(11.336f, 14.787f, 14.484f, 14.867f, 14.662f, 14.877f)
                curveTo(14.998f, 15.723f, 15.587f, 17.514f, 15.828f, 16.857f)
                lineTo(16.32f, 13.553f)
                curveTo(16.824f, 14.598f, 17.004f, 16.051f, 17.256f, 16.051f)
                curveTo(17.582f, 16.041f, 17.622f, 15.386f, 17.863f, 14.639f)
                curveTo(18.713f, 14.629f, 20.099f, 14.618f, 19.994f, 14.25f)
                curveTo(19.994f, 14.25f, 17.917f, 14.121f, 17.391f, 13.912f)
                curveTo(17.265f, 13.354f, 16.7f, 9.96f, 16.217f, 10.0f)
                close()
                moveTo(13.0f, 23.0f)
                curveTo(12.45f, 23.0f, 12.0f, 23.45f, 12.0f, 24.0f)
                curveTo(12.0f, 24.55f, 12.45f, 25.0f, 13.0f, 25.0f)
                lineTo(19.0f, 25.0f)
                curveTo(19.55f, 25.0f, 20.0f, 24.55f, 20.0f, 24.0f)
                curveTo(20.0f, 23.45f, 19.55f, 23.0f, 19.0f, 23.0f)
                lineTo(13.0f, 23.0f)
                close()
                moveTo(14.0f, 27.0f)
                curveTo(13.45f, 27.0f, 13.0f, 27.45f, 13.0f, 28.0f)
                curveTo(13.0f, 28.55f, 13.45f, 29.0f, 14.0f, 29.0f)
                lineTo(18.0f, 29.0f)
                curveTo(18.55f, 29.0f, 19.0f, 28.55f, 19.0f, 28.0f)
                curveTo(19.0f, 27.45f, 18.55f, 27.0f, 18.0f, 27.0f)
                lineTo(14.0f, 27.0f)
                close()
            }
        }
        .build()
        return _medapps!!
    }

private var _medapps: ImageVector? = null
